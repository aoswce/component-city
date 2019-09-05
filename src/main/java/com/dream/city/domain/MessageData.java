package com.dream.city.domain;

public class MessageData<T> {
    //事件类型
    String type;
    //接收事件处理的模块
    String model;
    //具体业务数据
    T t;

    public MessageData() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
