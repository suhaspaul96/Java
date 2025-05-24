package ex_09_Java_Oops_polymorphism;


class bankaccount{

    public double interestrate(){
        return 4.0;
    }
}

class savingaccount extends bankaccount{

    @Override
    public double interestrate(){
        return 6.0;
    }
}

class fdaccount extends bankaccount{
    @Override
    public double interestrate(){
        return 8.0;
    }
}

