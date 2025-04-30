# Bank Management System

A comprehensive Java-based ATM/Banking System with a graphical user interface built using Java Swing. This application simulates real-world banking operations with secure user authentication and database integration.

## Detailed Features

### User Authentication
- Secure login system with card number and PIN
- New user registration (3-step process)
- PIN change functionality
- Session management

### Account Management
- Multiple account types support:
  - Savings Account
  - Fixed Deposit Account
  - Current Account
  - Recurring Deposit Account
- Personal information management
- Account details viewing

### Transaction Operations
- **Cash Deposit**
  - Real-time balance update
  - Transaction receipt
  - Transaction history logging
- **Cash Withdrawal**
  - Multiple withdrawal options
  - Balance validation
  - Transaction limits
- **Fast Cash**
  - Quick withdrawal presets
  - Common denominations
  - Instant access
- **Balance Enquiry**
  - Current balance check
  - Mini statement generation
  - Transaction history

### Security Features
- Encrypted card numbers
- Secure PIN validation
- Transaction logging
- Session timeout
- Data validation
- Error handling

## Technical Architecture

### Frontend
- Java Swing for GUI
- AWT for window components
- Custom icons and images
- Responsive layout design

### Backend
- Java core for business logic
- MySQL database for data persistence
- JDBC for database connectivity
- Connection pooling

### Database Schema
```sql
-- Login Table
CREATE TABLE login (
    formno VARCHAR(30),
    cardnumber VARCHAR(30),
    pin VARCHAR(30)
);

-- Bank Table
CREATE TABLE bank (
    pin VARCHAR(10),
    date VARCHAR(50),
    type VARCHAR(20),
    amount VARCHAR(20)
);

-- SignupThree Table
CREATE TABLE signupthree (
    formno VARCHAR(20),
    accountType VARCHAR(40),
    cardnumber VARCHAR(25),
    pin VARCHAR(10),
    facility VARCHAR(100)
);
```

## Prerequisites

### Software Requirements
- JDK 19 or higher
- MySQL Server 8.0+
- NetBeans/Eclipse/IntelliJ IDEA
- Git (for version control)

### Libraries Required
- mysql-connector-java-8.0.28.jar
- jcalendar-tz-1.3.3-4.jar

## Installation & Setup

1. **Clone the Repository**
```bash
git clone https://github.com/Sachin48924/Bank-Management-System.git
cd Bank-Management-System
```

2. **Database Setup**
```sql
CREATE DATABASE bankSystem;
USE bankSystem;
-- Run the table creation scripts
```

3. **Configure Database Connection**
Update `Connn.java`:
```java
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","YourPassword");
```

4. **Add Required Libraries**
- Add MySQL Connector and JCalendar to your project's build path

5. **Compile and Run**
```bash
javac -cp ".:lib/*" src/bank/management/system/*.java
java -cp ".:lib/*" bank.management.system.Login
```

## Project Structure
```
src/
└── bank/
    └── management/
        └── system/
            ├── Login.java          # Entry point
            ├── Signup.java         # Registration process
            ├── Signup2.java        # Additional details
            ├── Signup3.java        # Account setup
            ├── main_Class.java     # Main interface
            ├── Deposit.java        # Deposit functionality
            ├── Withdrawl.java      # Withdrawal handling
            ├── FastCash.java       # Quick withdrawal
            ├── BalanceEnquriy.java # Balance check
            ├── mini.java          # Mini statement
            ├── Pin.java           # PIN management
            └── Connn.java         # Database connection
```

## Usage Guide

### New User Registration
1. Click "SIGN UP" on login screen
2. Complete personal details (Page 1)
3. Fill additional information (Page 2)
4. Choose account type and services (Page 3)
5. Note down card number and PIN

### Existing User Login
1. Enter card number and PIN
2. Access main menu
3. Select desired operation
4. Follow on-screen instructions

## Security Considerations

- PIN encryption
- Session management
- Input validation
- Error handling
- Transaction logging
- Database security

## Contributing

1. Fork the repository from https://github.com/Sachin48924/Bank-Management-System
2. Create feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'Add AmazingFeature'`)
4. Push to branch (`git push origin feature/AmazingFeature`)
5. Open Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Java Swing documentation
- MySQL documentation
- JCalendar library developers
- Icon providers

## Support

For support, email sachin48924@gmail.com or join our Discord channel.
