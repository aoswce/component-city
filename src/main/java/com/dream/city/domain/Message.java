package com.dream.city.domain;



import java.io.Serializable;

/**
 * @author Wvv
 */
public class Message<T> implements Serializable {

    private static final long serialVersionUID = -6451812593150428369L;

    /**
     * 信息来源
     */
    private String source;
    // 消息数据
    private MessageData data;
    // 发送目的地
    private String target;
    // 消息时间
    private String createtime;
    // 其他信息
    private String desc;


    public Message(String source, String target, String desc,
                       String createtime,
                   MessageData data) {
        super();
        this.source = source;
        this.data = data;
        this.target = target;
        this.createtime = createtime;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Message [source=" + source + ", desc=" + desc
                + ", data=" + data + ", target=" + target
                + ", createtime="
                + createtime + "]";
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public MessageData getData() {
        return data;
    }

    public void setData(MessageData data) {
        this.data = data;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
