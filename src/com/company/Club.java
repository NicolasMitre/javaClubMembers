package com.company;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Club {
    Set<ClubMember> members;

    public Club(){
        members = new LinkedHashSet<>();
    }

    public void associate(ClubMember member){
        this.members.add(member);

    }

    public void quit(ClubMember member){
        this.members.remove(member);
    }

    public void publishMember()
    {
        TreeSet<ClubMember> treeMember = new TreeSet<>();
        treeMember.addAll(this.members);
        for (ClubMember member :
                treeMember) {
            System.out.println(member.toString());
        }
    }
}