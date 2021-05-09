package org.cse222;

import java.util.ArrayList;

public class TechnicianWorker extends Person {


    /*addAnalysisResults parametresi generate edilecek!!!! */
    public void fillAnalysisResults(Patient patient, ArrayList<String> needAnalysis){
        for(int i=0;i<needAnalysis.size();++i){
            patient.addAnalysisResults(needAnalysis.get(i));
        }
    }

}
