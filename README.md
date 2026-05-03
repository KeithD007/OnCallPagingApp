# On-Call Paging App for Android
## Project Description
The On-Call Paging App is an Android-based application designed for hospital environments to improve communication during urgent and emergency situations. The application allows healthcare staff to quickly page on-call personnel without relying on manual phone calls or searching through call schedules.

The app provides a centralized interface where users can select a specific role, such as CT technologist, Cath lab team, radiologist, or supervisor, and send an alert directly to the appropriate on-call individual. The goal of the project is to create a simple, efficient, and user-friendly communication tool that improves response time and workflow efficiency in healthcare settings.

---	
## Problem Addressing
In many hospital departments, contacting on-call staff is a manual and time-consuming process. Staff must locate schedules, make phone calls, and often repeat the process if the first contact does not respond. This leads to delays in communication, workflow inefficiencies, and potential impacts on patient care.

The application addresses this problem by organizing on-call roles into a single interface and allowing users to quickly send alerts. By reducing the time needed to contact staff, the app improves response times and supports more efficient clinical workflows.

---
## Platform
Android (Primary Platform)
Developed using Android Studio
Designed for smartphones and tablets used in healthcare environments
Future expansion may include iOS or web-based platforms

---
## Front End and Back End Support
### Front End Support
####	 XML-based user interface design
####	Simple, clean layout for fast navigation
####	Multi-screen structure for ease of use under pressure
####	Screens include:
#####	Login
#####	Department selection
#####	Page type selection
#####	Confirmation
	
### Back End Support (Current and Future)
####	Current version does not include a live backend
####	Uses Android Intents for communication (SMS and Email)
####	Future implementation may include:
####	Cloud-based database
####	Real-time on-call scheduling
####	Integration with hospital systems
---
## Functionality
### Current Features
####	User login with basic validation
####	Selection of on-call roles:
#####		CT Technologist
#####		Cath Lab Team
#####		Radiologist
#####		Supervisor
####	Selection of page priority:
#####		Routine
#####		Urgent
#####		Emergency
####	Multi-screen navigation using Intents
####	Confirmation screen displaying selected options
####	Ability to send:
#####		SMS messages
#####		Email messages
####	Back navigation between screens
### Future Features
####	Real-time on-call integration
####	Secure authentication system
####	Escalation if no response is recieved
####	Admin tools for schedule management
####	Push notifications

---
## Design and Wireframes
###	Screen 1: Login Screen

a.	Username field

b.	Password field

c.	Sign In button

###	Screen 2: Home Screen

a.	Department list

b.	On call categories such as Radiology, Cath lab, Nursing Supervisor

c.	Button to view current on call staff

###	Screen 3: Staff Selection Screen

a.	Contact info for on call employee

b.	Send page button

###	Screen 4: Confirmation Screen

a.	Message that an alert was sent

b.	Time stamp

c.	Retry or escalate option

###	Screen 5: Admin Screen, optional future version

a.	Update on call schedules

b.	Add or remove staff

c.	Review alert log

---

## Current Implemenation (Week 8)
The application is a functional multi-screen Android app developed using Java and Android Studio.

### Implemented Screens
- Login Screen (MainActivity)
- Department Selection Screen (DepartmentActivity)
- Page Type Selection Screen (PageTypeActivity)
- Confirmation Screen (ConfirmActivity)
  
### Technical Concepts Used
- Java programming
- Android Activities and lifecycle
- Intents for navigation
- Implicit Intents for SMS and Email
- XML layouts
- Toast messages for feedback
  
### Application Flow
Login → Department Selection → Page Type → Confirmation → Send Page

### Limitations
- No backend database connection
- Contact data is not dynamically stored
- Relies on external apps for SMS and Email
- Basic authentication only
  
### Future Improvements
- Integrate backend database for real-time schedules
- Implement secure login system
- Store and manage contact information dynamically
- Add escalation logic for unanswered pages
- Improve UI/UX design
- Version Control

All updates and improvements are documented in the CHANGELOG.md file.
