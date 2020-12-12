package com.gabriellazar.model;

import javax.persistence.Entity;

@Entity
public class DebitAccount  extends Account{

    private double overDraftFee;
}
