package com.wuhenjian.aurora.utils.entity.dao;

import java.io.Serializable;
import java.util.Date;

public class MemberInfo implements Serializable {
    private Long miId;

    private Long maId;

    private Long faceId;

    private Long area;

    private String nickName;

    private String memberSign;

    private Integer sex;

    private Date lastLoginTime;

    private String lastLoginIP;

    private Integer lastLoginDevice;

    private static final long serialVersionUID = 1L;

    public Long getMiId() {
        return miId;
    }

    public void setMiId(Long miId) {
        this.miId = miId;
    }

    public Long getMaId() {
        return maId;
    }

    public void setMaId(Long maId) {
        this.maId = maId;
    }

    public Long getFaceId() {
        return faceId;
    }

    public void setFaceId(Long faceId) {
        this.faceId = faceId;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getMemberSign() {
        return memberSign;
    }

    public void setMemberSign(String memberSign) {
        this.memberSign = memberSign == null ? null : memberSign.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP == null ? null : lastLoginIP.trim();
    }

    public Integer getLastLoginDevice() {
        return lastLoginDevice;
    }

    public void setLastLoginDevice(Integer lastLoginDevice) {
        this.lastLoginDevice = lastLoginDevice;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MemberInfo other = (MemberInfo) that;
        return (this.getMiId() == null ? other.getMiId() == null : this.getMiId().equals(other.getMiId()))
            && (this.getMaId() == null ? other.getMaId() == null : this.getMaId().equals(other.getMaId()))
            && (this.getFaceId() == null ? other.getFaceId() == null : this.getFaceId().equals(other.getFaceId()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getMemberSign() == null ? other.getMemberSign() == null : this.getMemberSign().equals(other.getMemberSign()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getLastLoginIP() == null ? other.getLastLoginIP() == null : this.getLastLoginIP().equals(other.getLastLoginIP()))
            && (this.getLastLoginDevice() == null ? other.getLastLoginDevice() == null : this.getLastLoginDevice().equals(other.getLastLoginDevice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMiId() == null) ? 0 : getMiId().hashCode());
        result = prime * result + ((getMaId() == null) ? 0 : getMaId().hashCode());
        result = prime * result + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getMemberSign() == null) ? 0 : getMemberSign().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getLastLoginIP() == null) ? 0 : getLastLoginIP().hashCode());
        result = prime * result + ((getLastLoginDevice() == null) ? 0 : getLastLoginDevice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", miId=").append(miId);
        sb.append(", maId=").append(maId);
        sb.append(", faceId=").append(faceId);
        sb.append(", area=").append(area);
        sb.append(", nickName=").append(nickName);
        sb.append(", memberSign=").append(memberSign);
        sb.append(", sex=").append(sex);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", lastLoginIP=").append(lastLoginIP);
        sb.append(", lastLoginDevice=").append(lastLoginDevice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}