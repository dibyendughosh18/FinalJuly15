package com.dto;

public class  Letter{




    public Letter(String letter_name,String p_path,String process_year,String Process_year_component,String print_namer) {
        super();
        this.letter_name = letter_name;
        this.p_path = p_path;
        this.process_year =process_year;
        this.Process_year_component = Process_year_component;
        this.print_name_prg = print_namer;

    }



    String letter_name;
    String p_path;
    String process_year;
    String Process_year_component;
    String print_name_prg;

    public String getLetter_name() {
        return letter_name;
    }

    public void setLetter_name(String letter_name) {
        this.letter_name = letter_name;
    }

    public String getP_path() {
        return p_path;
    }

    public void setP_path(String p_path) {
        this.p_path = p_path;
    }

    public String getProcess_year() {
        return process_year;
    }

    public void setProcess_year(String process_year) {
        this.process_year = process_year;
    }

    public String getProcess_year_component() {
        return Process_year_component;
    }

    public void setProcess_year_component(String process_year_component) {
        Process_year_component = process_year_component;
    }

    public String getPrint_name_prg() {
        return print_name_prg;
    }

    public void setPrint_name_prg(String print_name_prg) {
        this.print_name_prg = print_name_prg;
    }
}


