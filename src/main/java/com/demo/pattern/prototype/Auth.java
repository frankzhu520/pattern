package com.demo.pattern.prototype;


import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Auth implements Cloneable,Serializable {

    public String userCode;

    public int age;

    public List<String> authList;

    public Auth() {
        this.authList = new ArrayList<String>();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }


    public Object deepClone(){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Auth copy = (Auth)ois.readObject();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


    public Auth shallowClone(Auth target){

        Auth auth = new Auth();
        auth.age = target.age;
        auth.userCode = target.userCode;
        auth.authList = target.authList;
        return  auth;
    }


}
