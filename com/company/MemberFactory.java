package com.company;

public class MemberFactory {

    public Staff desiredMember(String memberName) {
        if(memberName == null) {
            return null;
        }
        if(memberName.equalsIgnoreCase("teachingassistant")) {
            return new TeachingAssistant();
        }
        else if(memberName.equalsIgnoreCase("doctor") ) {
            return new Doctor();
        }
        return null;
    }
}
