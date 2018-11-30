package com.dejong.member;

import com.dejong.process.*;

public class MembershipSimpleFactory {

    public ProcessOrderTemplate membership(MembershipType type) {
        ProcessOrderTemplate template;

        if(type == MembershipType.NONE) {
            template = new NoMembershipDiscount();
        } else if(type == MembershipType.BLUE) {
            template = new BlueMembershipDiscount();
        } else if(type == MembershipType.SILVER) {
            template = new SilverMembershipDiscount();
        } else if(type ==  MembershipType.GOLD) {
            template = new GoldMembershipDiscount();
        } else {
            throw new NullPointerException();
        }

        return template;
    }

}
