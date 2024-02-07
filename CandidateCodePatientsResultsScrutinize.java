import java.io.*;
import java.util.*;
import java.lang.*;


public class CandidateCodePatientsResultsScrutinize {
   public static void main(String args[]) throws Exception {

	String Virusunderscrutiny="coronavirus";

	  String InputLangKeywordFilename = "D:\\Saif\\LocallangProgram\\Test\\Inputtestfiletobescrutinizedforpatientresults.txt";

	      String strCurrentLinenew2 = "";
	      String keyword2=""; 
		  String keywordstartpattern2 = "-";
		  
		  int keywordhyphenstartpattern2 =0;
		  
		  int counter2 =0;
		  
	      Hashtable<Integer,String> ht2=new Hashtable<Integer,String>();  
	      Hashtable<Integer,String> hm2=new Hashtable<Integer,String>();  
	      int zkj;
	      zkj=0;
		  
/**	      try {

			  BufferedReader br_inputlanglkfile = new BufferedReader(new FileReader(InputLangKeywordFilename ));
					  
			    while ((strCurrentLinenew2=br_inputlanglkfile.readLine()) != null) {

				if (zkj<=2) {
			        System.out.println("strCurrentLinenew2 " + strCurrentLinenew2);
			    	
			        keywordhyphenstartpattern2 = strCurrentLinenew2.indexOf(keywordstartpattern2)	;
			    	if (keywordhyphenstartpattern2>0) {
			        keyword2 = strCurrentLinenew2.substring(keywordhyphenstartpattern2);
			    	keyword2 = keyword2.substring(2, keyword2.length());
			    	keyword2 = keyword2.trim();
			    	ht2.put(counter2, ""+keyword2);
				hm2.put(counter2, ""+counter2);
			    	System.out.println("keyword2 - " +keyword2);

			    	counter2 = counter2 + 1;
				}
				zkj=zkj+1;
			    	}
			    }
			    br_inputlanglkfile.close();
			   } catch (IOException ZKTDTKiznkioe) {
				ZKTDTKiznkioe.getStackTrace();   
			   } catch (Exception e) {
				e.getStackTrace();   
			   } 		

**/

String BloodCompositionofpatients[]=new String[10];

int zijk;
zijk=0;
int numberofpatients;
numberofpatients=0;


String args1[]={"1","2","3"};
String args2[]={"abcde","abcdecrnas","onarous"};

int arg2lensi=0;

/**System.out.print("String Array: [ "); 
        for (String c : args2) { 
            System.out.print(c); 
            arg2lensi++; 
        } **/

arg2lensi=2;

Virusunderscrutiny="args2abcde";
int nzpatientnumber=0;

String nzpatientnumberstring="0";

try {
nzpatientnumberstring = args2[1];
nzpatientnumber= arg2lensi; //Integer.parseInt(nzpatientnumberstring);
} catch(NumberFormatException ZKTDTKNFEbNFEiznkioe) {
ZKTDTKNFEbNFEiznkioe.getStackTrace();
} catch (Exception e) {
e.getStackTrace();
}

int i;
i=0;

String BloodSequenceofpatients[]=new String[3];

//get the order of bit endian of the blood infected by virus and blood sequence
while (args2[i]!="") {

BloodSequenceofpatients[i] = args2[i];
i++;
if (i==arg2lensi)
  break;
}

//nzpatientnumber=nzpatientnumber-1;

int patientBloodsequencelength=0;
int klm=0;

char zlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt='a';
char txnzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt='u';

int tinzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= 0;
int tnitxnzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= 1;


for (klm=0;klm<nzpatientnumber;klm++) {

patientBloodsequencelength = BloodSequenceofpatients[klm].length()-1;

//has to be checked
int BloodSequenceFlagSetPresent[]= new int[patientBloodsequencelength];

String PatientBloodSequenceofPatienttobeinvestigatedSequence=BloodSequenceofpatients[klm];
int z=0;

int knz;
knz=PatientBloodSequenceofPatienttobeinvestigatedSequence.length();

//int PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence[];
// PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence= new int[knz];

int zkn=0;

int PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool=0;
int Stringindexofbloodcompositionsequencestringinviruscompositionstring=0;
String bkh="";
String PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence="";




for(zkn=0;zkn<knz;zkn++) {
z=0;

String PatientBloodSequenceofPatienttobestringtobesearched = "";
PatientBloodSequenceofPatienttobestringtobesearched = Character.toString(PatientBloodSequenceofPatienttobeinvestigatedSequence.charAt(z));

Stringindexofbloodcompositionsequencestringinviruscompositionstring = Virusunderscrutiny.indexOf(PatientBloodSequenceofPatienttobestringtobesearched);

bkh=Character.toString(Virusunderscrutiny.charAt(Stringindexofbloodcompositionsequencestringinviruscompositionstring));

if (PatientBloodSequenceofPatienttobestringtobesearched ==  bkh){ 
z++;
}
else {
System.out.println("sequence not matched");
}
}
int nkz=0;


PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence="";

String currentbloodsequenceintrialscrutiny=BloodSequenceofpatients[zkn];

PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence=currentbloodsequenceintrialscrutiny;

//char zlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.charAt(PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.indexOf[nkz]);
//char txnzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.charAt(PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.indexOf[nkz+1]);
zlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= 'i';
txnzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= 'z';
String strzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt="";
String strtxnzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt="";




for(nkz=0;nkz<zkn;nkz++) {
//zlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.charAt(PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.indexOf[nkz]);
//txnzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.charAt(PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.indexOf[nkz+1]);

tinzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= 0;
tnitxnzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= 1;

int njpbkh=z;

strzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= Character.toString(PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.charAt(njpbkh)) ;
strtxnzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt= Character.toString(PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence.charAt(njpbkh+1));


   if (strzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt.trim()!=strtxnzlknvariablePatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencecharAt.trim()){
   //set ascending order flag  PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool=0;
   PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool=0;     
   } else {
   PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool=1;     
}
}

int lycydsknjgtrck=nzpatientnumber;

int PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[];
PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult = new int[lycydsknjgtrck];
int ijknz=0;

while (ijknz<nzpatientnumber){
if (PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool==0) {
PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]= 0;
} else {
PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]= 1;
}

if(PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]==0) {
   System.out.println("Result - "+PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]+" - success ...- not corona positive");
} else {
   System.out.println("Result - "+PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]+" - failure ...- corona positive");
}

ijknz=ijknz+1;
}


}

    }
}

