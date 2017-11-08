package cn.lonecloud.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by lonecloud on 16/12/26.
 */
@Component
@ConfigurationProperties(value = "girl")
public class Girl {

    private String cupSize;

    private int year;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {

        return year;
    }

    public String getCupSize() {

        return cupSize;
    }
}
