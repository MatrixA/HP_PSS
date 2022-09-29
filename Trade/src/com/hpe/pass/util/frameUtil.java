/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pass.util;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;



/**
 *产生内部窗体，并保证唯一性
 * @author lenovo
 */
public class frameUtil {
    public static HashMap<String,JInternalFrame> framemap = 
            new HashMap<String,JInternalFrame>();
    //产生内部窗体的思路，当点击菜单时，
    //首次在集合中查找是否存在对象，已经存在，就从集合中获取对象，
    //如果不存在，生成新的对象并存入集合(键值为类的名称)
    public static JInternalFrame buildFrame(Class clazz){
        JInternalFrame frame = null;
        if(framemap.containsKey(clazz.getName())){
            //根据键直接获取对象
          frame =  framemap.get(clazz.getName());
        }else{
            try {
                //集合中不存在键，说明之前没有创建过
                frame =(JInternalFrame) clazz.newInstance();
                //存入集合
                framemap.put(clazz.getName(), frame);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return frame;
    }
}
