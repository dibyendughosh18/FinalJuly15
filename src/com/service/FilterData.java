package com.service;
import com.dto.Coresponse;
import com.dto.Letter;
import com.dto.RequestDto;

import java.util.ArrayList;
import java.util.List;

public class FilterData {//1

    static final int CURENT_YR = 2019;
    int offset = CURENT_YR - 10; //2009

    String  path = System.getProperty("user.dir");
   public List<Letter> dataToFilter() {//2
    List<Letter> letters = new ArrayList<Letter>(); 
        //3


            String proc_year_component;
            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2009) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("P25", path, proc_year, proc_year_component, "PRINT_P25_TRANS");
                letters.add(letter);


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2009) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("A_P25", path, proc_year, proc_year_component, "PRINT_P25_TRANS");
                letters.add(letter);


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2009) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("RM_P25", path, proc_year, proc_year_component, "PRINT_P25_TRANS");
                letters.add(letter);


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("P20", path, proc_year, proc_year_component, "PRINT_P20_TRANS");
                letters.add(letter);


            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("RC_P20", path, proc_year, proc_year_component, "PRINT_P20_TRANS");
                letters.add(letter);

            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("RM_P20", path, proc_year, proc_year_component, "PRINT_P20_TRANS");
                letters.add(letter);

            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("A_P20", path, proc_year, proc_year_component, "PRINT_P20_TRANS");
                letters.add(letter);

            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("AM_RC", path, proc_year, proc_year_component, "PRINT_P20_TRANS");
                letters.add(letter);

            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("RC_AF_ST", path, proc_year, proc_year_component, "PRINT_P20_TRANS");
                letters.add(letter);

            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                } else {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                }

                Letter letter = new Letter("RM_RC", path, proc_year, proc_year_component, "PRINT_P20_TRANS");
                letters.add(letter);

            }


            for (int i = 0; i < 12; i++) {


                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2009) {
                    proc_year_component = "";
                    Letter letter = new Letter("P57", path, proc_year, proc_year_component, "PRINT_P57_TRANS");
                    letters.add(letter);
                } else if ((offset + i) < 2010 && ((offset + i) < 2007)) {
                    proc_year_component = String.valueOf((offset + i) % 2000);
                    Letter letter = new Letter("P57", path, proc_year, proc_year_component, "PRINT_P57_TRANS");
                    letters.add(letter);

                } else {
                    proc_year_component = "";
                    Letter letter = new Letter("P57", path, proc_year, proc_year_component, "NONE");
                    letters.add(letter);

                }

                //Letter letter = new Letter("P57", path, proc_year, proc_year_component, "PRINT_P57_TRANS");
               

            }


            for (int i = 0; i < 12; i++) {
                String proc_year = String.valueOf(offset + i); //2009 + i

                if ((offset + i) > 2010) {
                    proc_year_component = "";
                    Letter letter = new Letter("ST_NT", path, proc_year, proc_year_component, "PRINT_P32_TRANS");
                    letters.add(letter);
                } else {

                    proc_year_component = "";
                    Letter letter = new Letter("ST_NT", path, proc_year, proc_year_component, "NONE");
                    letters.add(letter);
                }
			}

                for (int i = 0; i < 12; i++) {
                    String proc_year = String.valueOf(offset + i); //2009 + i

                    if ((offset + i) > 2010) {
                        proc_year_component = "";
                        Letter letter = new Letter("RM_ST", path, proc_year, proc_year_component, "PRINT_P32_TRANS");
                        letters.add(letter);
                    } else {

                        proc_year_component = "";
                        Letter letter = new Letter("ST_NT", path, proc_year, proc_year_component, "NONE");
                        letters.add(letter);
                    }


                }
                
				/****  For Last Record add Last Record
				
						letter_name = "LAST RECORD";
						p_path = path; //curret Directory
						process_year =proc_year; //2019
						Process_year_component = "NONE";
						print_name_prg = "NONE";
		        *****/
				//String proc_yr2 = String.valueOf(offset); //2019
				//Letter letter = new Letter("LAST RECORD", path, proc_yr2, "NONE", "NONE");
				//letters.add(letter);
				

			return letters;   
	
    }
    
}

