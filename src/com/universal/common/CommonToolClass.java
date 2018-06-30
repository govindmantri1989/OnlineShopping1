
package com.universal.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CommonToolClass {
    static Configuration cfg;
      static Session session=null;
    public static Session getSession(){
        if(cfg==null){
        Configuration cfg=new Configuration();
            session = cfg.configure().buildSessionFactory().openSession();
            System.out.println("dlfkjld");
     
        }
        return session;
    }
}
