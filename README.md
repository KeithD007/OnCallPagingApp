# On-Call Paging App for Android

## Project Description
The On-Call Paging App is an Android-based application designed for hospital environments to improve communication during urgent and emergency situations. The application allows healthcare staff to quickly page on-call personnel without relying on manual phone calls or searching through call schedules.

The app provides a centralized interface where users can select a specific role and send an alert directly to the appropriate on-call individual.

**Key goals:**
- Improve response time  
- Reduce workflow delays  
- Provide a centralized communication tool  
- Support efficient healthcare operations  

---

## Problem Addressing
In many hospital departments, contacting on-call staff is a manual and time-consuming process.

**Current challenges include:**
- Searching for schedules  
- Making multiple phone calls  
- Repeating contact attempts if no answer  
- Delays in urgent situations  

**Impact:**
- Workflow inefficiencies  
- Staff frustration  
- Delays in patient care  

**Solution provided by the app:**
- Centralized role selection  
- Quick alert communication  
- Improved response time  
- More efficient clinical workflows  

---

## Platform
- Android (Primary Platform)  
- Developed using Android Studio  
- Designed for smartphones and tablets in healthcare environments  

**Future expansion:**
- iOS platform  
- Web-based access  

---

## Front End and Back End Support

### Front End Support
- XML-based user interface design  
- Simple, clean layout for fast navigation  
- Multi-screen structure for ease of use under pressure  

**Screens include:**
- Login  
- Department selection  
- Page type selection  
- Confirmation  

---

### Back End Support (Current and Future)

**Current:**
- No live backend connection  
- Uses Android Intents for:
  - SMS  
  - Email  

**Future:**
- Cloud-based database  
- Real-time on-call scheduling  
- Integration with hospital systems  

---

## Functionality

### Current Features
- User login with basic validation  

- Selection of on-call roles:
  - CT Technologist  
  - Cath Lab Team  
  - Radiologist  
  - Supervisor  

- Page priority selection:
  - Routine  
  - Urgent  
  - Emergency  

- Multi-screen navigation using Intents  

- Confirmation screen displaying selected options  

- Communication options:
  - SMS messages  
  - Email messages  

- Back navigation between screens  

---

### Future Features
- Real-time on-call integration  
- Secure authentication system  
- Escalation if no response is received  
- Admin tools for schedule management  
- Push notifications  

---

## Design and Wireframes

### Screen 1: Login Screen
- Username field  
- Password field  
- Sign In button  

---

### Screen 2: Department Selection
- Department list  
- On-call categories:
  - Radiology  
  - Cath Lab  
  - Nursing Supervisor  

---

### Screen 3: Page Type Selection
- Routine  
- Urgent  
- Emergency  

---

### Screen 4: Confirmation Screen
- Displays selected role and priority  
- Send options:
  - SMS  
  - Email  
- Confirmation message with timestamp  

---

### Screen 5: Admin Screen (Future)
- Update on-call schedules  
- Add or remove staff  
- Review alert log  

---

## Current Implementation (Week 8)
The application is a functional multi-screen Android app developed using Java and Android Studio.

### Implemented Screens
- Login Screen (MainActivity)  
- Department Selection Screen (DepartmentActivity)  
- Page Type Selection Screen (PageTypeActivity)  
- Confirmation Screen (ConfirmActivity)  

---

### Technical Concepts Used
- Java programming  
- Android Activities and lifecycle  
- Intents for navigation  
- Implicit Intents for SMS and Email  
- XML layouts  
- Toast messages for feedback  

---

### Application Flow
Login → Department Selection → Page Type → Confirmation → Send Page  

---

### Limitations
- No backend database connection  
- Contact data is not dynamically stored  
- Relies on external apps for SMS and Email  
- Basic authentication only  

---

### Future Improvements
- Integrate backend database for real-time schedules  
- Implement secure login system  
- Store and manage contact information dynamically  
- Add escalation logic for unanswered pages  
- Improve UI/UX design  

---

## Version Control
All updates and improvements are documented in the CHANGELOG.md file.
