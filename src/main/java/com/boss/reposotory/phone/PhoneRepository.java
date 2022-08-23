package com.boss.reposotory.phone;

import com.boss.domain.Phone;
import com.boss.reposotory.CRUDRepository;

import java.util.Map;

public interface PhoneRepository extends CRUDRepository <Long, Phone> {

    Map<String, Object> getMapOfPhone();
}
