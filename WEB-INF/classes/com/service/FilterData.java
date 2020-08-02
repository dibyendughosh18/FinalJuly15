package com.service;
import com.dto.Coresponse;
import com.dto.Letter;
import com.dto.RequestDto;

import java.util.ArrayList;

public class FilterData {//1

    static final int CURENT_YR = 2019;
    int offset = CURENT_YR - 10; //2009

    String  path = System.getProperty("user.dir");
   public ArrayList<Letter> dataToFilter() {//2
    ArrayList<Letter> letters = new ArrayList<Letter>() 
        {//3


            String proc_year_component;
            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2009) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("P25", path, proc_year, proc_year_component, "PRINT_P25_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2009) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("A_P25", path, proc_year, proc_year_component, "PRINT_P25_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2009) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("RM_P25", path, proc_year, proc_year_component, "PRINT_P25_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("P20", path, proc_year, proc_year_component, "PRINT_P20_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("RC_P20", path, proc_year, proc_year_component, "PRINT_P20_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("RM_P20", path, proc_year, proc_year_component, "PRINT_P20_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("A_P20", path, proc_year, proc_year_component, "PRINT_P20_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("AM_RC", path, proc_year, proc_year_component, "PRINT_P20_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("RC_AF_ST", path, proc_year, proc_year_component, "PRINT_P20_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                add(new Letter("RM_RC", path, proc_year, proc_year_component, "PRINT_P20_TRANS"));


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2009) {
                    proc_year_component = "";
                    add(new Letter("P57", path, proc_year, proc_year_component, "PRINT_P57_TRANS"));
                } else if ((offset + i) < 2010 && ((offset + i) < 2007)) {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                    add(new Letter("P57", path, proc_year, proc_year_component, "PRINT_P57_TRANS"));

                } else {
                    proc_year_component = "";
                    add(new Letter("P57", path, proc_year, proc_year_component, "NONE"));

                }

                add(new Letter("P57", path, proc_year, proc_year_component, "PRINT_P57_TRANS"));


            }


            for (int i = 0; i < 12; i++) {
                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                    add(new Letter("ST_NT", path, proc_year, proc_year_component, "PRINT_P32_TRANS"));
                } else {

                    proc_year_component = "";
                    add(new Letter("ST_NT", path, proc_year, proc_year_component, "NONE"));
                }
			}

                for (int i = 0; i < 12; j++) {
                    proc_year = String.valueOf(offset + i); //2009 + i

                    if ((offset + i) > 2010) {
                        proc_year_component = "";
                        add(new Letter("RM_ST", path, proc_year, proc_year_component, "PRINT_P32_TRANS"));
                    } else {

                        proc_year_component = "";
                        add(new Letter("ST_NT", path, proc_year, proc_year_component, "NONE"));
                    }


                }
                
				/****  For Last Record add Last Record
				
						letter_name = "LAST RECORD";
						p_path = path; //curret Directory
						process_year =proc_year; //2019
						Process_year_component = "NONE";
						print_name_prg = "NONE";
		        *****/
				String proc_yr2 = String.valueOf(offset); //2019
				add(new Letter("LAST RECORD", path, proc_yr2, "NONE", "NONE"));
				
				

            
	
    }
    return letters;
}
}
