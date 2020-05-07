package com.company;

import java.util.Objects;
import java.util.UUID;

public class ClubMember implements Comparable{
    private String name;
    private UUID id;
    private String phone;
    private Integer age;
    private Integer votes;
    private boolean voted;
    private boolean eligible;

    public ClubMember(String name, String phone, Integer age){
        this.name = name;
        this.id = UUID.randomUUID();
        this.phone = phone;
        this.age = age;
        this.votes = 0;
        this.voted = false;
        this.eligible = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes += votes ;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    public void vote(ClubMember member){
        if(!member.isVoted()&& member.eligible ){

            if(!this.equals(member)){
                setVoted(true);
                member.setVotes(1);
            }
        }else{
            this.eligible = false;
        }
    }

    public boolean compareName(ClubMember member){
        boolean flag = false;
        if(this.getName() == member.getName()){
            flag = this.equals(member);
        }
        return flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClubMember that = (ClubMember) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Object o) {
        int x = 0;
        if(o instanceof ClubMember)
        {
            ClubMember m = (ClubMember) o;
            x =this.getName().compareTo(m.getName());
        }
        return x;
    }

    @Override
    public String toString() {
        return "ClubMember{" + "elegible= "+ this.eligible + "voted= "+this.voted +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", votes=" + votes +
                '}';
    }
}