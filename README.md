OPD PATIENTS MANAGEMENT APPLICATION project is a graphical user-interface(gui) application which will enable hospital staff (mainly receptionists, nurses and doctors) handle the creation and management of patient folders and files. Read and write access to patients file is clearly defined in each staff category dashboard.
The entry point for the application is the 'login.java' where the hospital staff is required to enter their assigned username and password. The staff can choose to change their login details after they are logged into their respective dashboard.
Category of staff is done into three (3) which are Receptionists, Nurses, and Doctors. Each staff category is given a unique identifier called 'designation'.  For example, Receptionists are given 'designation ID' of 3, Nurses are given 'designation ID' of 4 and doctors are given 'designation ID' of 5. 
Below is a table of staff login details stored in the database ‘staff.sqlite’ (table name is staff)  which is initially created for staff of the hospital.
Username	Password	Designation
kinggom	pasty99	3
hesihesi	49tom	4
iamdoci	iykemda	5
basmalik	mabash45yy	5
skyrock	heavy45	5
RabiRabi	rab3457	3
eddykay	nzeqadd	4

Responsibilities or access assigned to each staff category is as follows
Receptionist (Receptionist.java)
•	Responsible for registering and creating folders for new hospital patients (RegisterNewPatient.java)
•	Responsible for creating files for existing patients (CreatePatientFile.java)
•	Editing patient profile information (EditPatientProfile.java)

Nurses (Nurse.java)
•	Responsible for recording vital information in the vital section of patient file (AddVitalsToPatientFile.java)
•	They can also edit information in the vitals section of the patient file (EditPatientVitalsInfo.java)

Doctors (Doctor.java)
•	Recording/Editing patient diagnosis in the ‘diagnosis_information’ section of patient file (AddDiagnosisToPatientFile.java)
•	Recording/Editing labs to be done for patient in the ‘labs_ordered’ section of patient file (OrderLabForPatient.java)
•	Recording/Editing prescribed drugs in the ‘drug_prescribtion’ section of patient file (PrescribeDrugsForPatient.java)
•	They can also view all the day’s information on a file of a patient (EditOrViewMyNotes.java)


Below is the components of the application and their function
Login.java
This is entry point of the application. Staff uses the credentials initially created for them to login into their respective dashboard. The table below contains the login credentials created for staff.
Username	Password	Designation
kinggom	pasty99	3
hesihesi	49tom	4
iamdoci	iykemda	5
basmalik	mabash45yy	5
skyrock	heavy45	5
RabiRabi	rab3457	3
eddykay	nzeqadd	4

Receptionist.java
This is the dashboard for receptionist. They have the following buttons that help receptionists carry out the operations associated with them.
•	‘Log Out’ button to log out receptionists.
•	‘Edit My Profile’ button to help receptionists change their login credentials.
•	‘REGISTER NEW PATIENTS’ button to help receptionists register new patients and create folders for them.
•	‘CREATE NEW FILE FOR PATIENTS’ to help receptionists create a file to be added to the patient folder.
•	‘EDIT PATIENTS PROFILE’ to help receptionists edit details of patients.

Nurses.java
This is the dashboard for nurses. They have the following buttons that help nurses carry out the operations associated with them.
•	‘Log Out’ button to help nurses log out of the application.
•	‘Edit My Profile’ button to help nurses change their login credentials.
•	‘ADD VITALS INFORMATION TO PATIENTS FILE’ to assist nurses record patient’s vitals into the file.
•	‘EDIT PATIENTS VITALS INFORMATION’ to assist nurses edit patient’s vital information.



Doctor.java
This is the dashboard for doctors. They have the following buttons that help doctors carry out the operations associated with them.

•	‘Log Out’ button to help doctors log out of the application.
•	‘Edit My Profile’ button to help doctors change their login credentials.
•	‘ADD DIAGNOSIS NOTE TO PATIENT FILE’ button to assist doctors record patient’s diagnosis into his file.
•	‘ORDER/REQUEST LAB(S) FOR PATIENT’ button to assist doctors to record lab(s) to done on the patient into the patient’s file.
•	‘PRESCRIBE DRUGS FOR PATIENT’ button to assist doctors to record drugs prescribed for patient into the patient’s file.
•	‘VIEW PATIENT FILE FOR TODAY’ button to assist doctors view patient file for the day.

RegisterNewPatients.java
Contains fields to be filled in order to register new patients of the hospital.
CreatePatientFile.java
Its main function it to create new file for patients. Receptionist will first have to search for patient using one of the filter fields provided. The search results will then be displayed in a table. Clicking on the row that contains the patient’s details automatically create file for that patient.


EditPatientProfile.java
Its main function is to help receptionist edit profile of patients. Receptionist will first have to search for the patient using one of the filter fields provided. The search results will then be displayed in a table. Clicking on the row that contains the patient’s details will automatically populate the patient’s profile information into the fields on the right-hand side. The staff can then proceed to change the details as they see fit to be changed.

AddVitalsToPatientFile.java
Its main function is to assist nurses record patients’ vital information into their file. Nurses will first have to search for patient using one of the filter fields provided. The search results will then be displayed in a table. The nurse will then click on the row containing the patient details and then record the necessary vitals in the text editor on the right-hand side.

EditPatientVitalsInfo.java
This helps nurses edit patient’s vital information. Nurses first have to search for patient using one of the filter fields provided. The results will then be displayed in a table. The nurse will then click on the row containing the patient details and then record the necessary vitals in the text editor on the right-hand side.

AddDiagnosisToPatientFile.java
Its main function is to assist doctors record patients’ diagnosis into their file. Doctors will first have to search for patient using one of the filter fields provided. The results will then be displayed in a table. The doctor will then click on the row containing the patient details and then record the necessary diagnosis in the text editor on the right-hand side.

OrderLabForPatient.java
Its main function is to assist doctors record labs to done on patients into their file. Doctors will first have to search for patient using one of the filter fields provided. The search results will then be displayed in a table. The doctor will then click on the row containing the patient details and then record the necessary labs to done on the patient in the text editor on the right-hand side.


PrescribeDrugsForPatient.java
Its main function is to assist doctors record prescribed drugs into patient’s file. Doctors will first have to search for patient using one of the filter fields provided. The results will then be displayed in a table. The doctor will then click on the row containing the patient details and then record the prescribed drugs in the text editor on the right-hand side.

EditOrViewMyNotes.java
Its main function is to assist doctors view the contents of patient file for the day. Doctors will first have to search for patient using one of the filter fields provided. The search results will then be displayed in a table. The doctor will then click on the row containing the patient details and contents of the patient file for the day will be displayed in the text editor on the right-hand side.

ChangeLoginDetails.java and NewUsernameAndPassword.java
Their main function is to assist staff to change their login credentials.

Search.java
This provides the functionality used to search for patient.
# OPD-Patient-Management
