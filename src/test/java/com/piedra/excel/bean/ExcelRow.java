package com.piedra.excel.bean;

import com.piedra.excel.annotation.ExcelExport;

import java.util.Date;

/**
 * @Description: Excel��һ�ж�Ӧ��JavaBean��
 * @Creator��linwb 2014-12-19
 */
public class ExcelRow {

    @ExcelExport(header="����",colWidth=50)
    private String name="AAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
    @ExcelExport(header="����")
    private int age=80;

    /** �������û��ע��,��ô����������ڵ�����excel�ļ���*/
    private String clazz="SSSSSSSSS";

    @ExcelExport(header="����")
    private String country="RRRRRRR";
    @ExcelExport(header="����")
    private String city="EEEEEEEEE";
    @ExcelExport(header="����")
    private String town="WWWWWWW";

    /** �������û��ע��,��ô����������ڵ�����excel�ļ���*/
    private String common="DDDDDDDD";

    /** ���colWidth <= 0 ��ôȡĬ�ϵ� 15 */
    @ExcelExport(header="��������",colWidth=-1)
    private Date birth = new Date();

    public ExcelRow(){
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getClazz() {
        return clazz;
    }
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
    public String getCommon() {
        return common;
    }
    public void setCommon(String common) {
        this.common = common;
    }
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }
}
