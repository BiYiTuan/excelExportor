package com.piedra.excel.bean;

import com.piedra.excel.annotation.ExcelExport;

import java.util.Date;

/**
 * @Description: Excel��һ�ж�Ӧ��JavaBean��
 * @Creator��linwb 2014-12-19
 */
public class ExcelRowForMultiHeaders {
    @ExcelExport(header="����",colspan="1",rowspan="3")
    private String name="������";

    @ExcelExport(header="ʡ��,����",colspan="1,5",rowspan="1,2")
    private String province="����ʡ";
    @ExcelExport(header="����",colspan="1",rowspan="1")
    private String city="����ʡ";
    @ExcelExport(header="����",colspan="1",rowspan="1")
    private String town="��֪�δ�";

    @ExcelExport(header="����,����ͱ�ע",colspan="1,2",rowspan="1,1")
    private int age=80;
    @ExcelExport(header="��ע?",colspan="1",rowspan="1")
    private String common="���Ǳ�ע,���Ǳ�ע";

    @ExcelExport(header="�ҵ�����",colspan="1",rowspan="3",datePattern="yyyy-MM-dd HH:mm:ss")
    private Date birth = new Date();

    /** �������û��ע��,��ô����������ڵ�����excel�ļ���*/
    private String clazz="�Ҳ�����ֵ�,��������� @ExcelExport ע����";

    public ExcelRowForMultiHeaders(){
    }

    public String getClazz() {
        return clazz;
    }
    public void setClazz(String clazz) {
        this.clazz = clazz;
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
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
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
