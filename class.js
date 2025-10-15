// class Animal {
//     constructor(name) {
//       this.name = name;
//     }
  
//     eat() {
//       console.log(`${this.name} sedang makan`);
//     }
//   }
  
//   class Cat extends Animal {
//     meow() {
//       console.log(`${this.name} mengeong`);
//     }
//   }
  
  
//   const kucing = new Cat("Tom");
  
  
//   kucing.eat();
//   kucing.meow();

// class Animal {
//     constructor(name) {
//       this.name = name;
//     }
  
//     eat() {
//       console.log(`${this.name} sedang makan`);
//     }
//   }
  
//   class Dog extends Animal {
//     meow() {
//       console.log(`${this.name} menggonggong`);
//     }
//   }
  
  
//   const anjing = new Dog("Tom");
  
  
//   anjing.eat();
//   anjing.meow();

// class Employee {
//     constructor(name, position, salary) {
//         this.name = name;
//         this.position = position;
//         this.salary = salary;
//     }
// }

// class Manager extends Employee {
//     constructor(name, position, salary, department) {
//         super(name, position, salary);
//         this.department = department;
//     }

//     lead() {
//         console.log(`${this.name} memimpin departemen ${this.department}.`);
//     }

//     showAll() {
//         console.log("Nama:", this.name);
//         console.log("Jabatan:", this.position);
//         console.log("Gaji:", this.salary);
//         console.log("Departemen:", this.department);
//     }
// }

// // Contoh penggunaan
// const manager = new Manager("Andi", "Manager", 15000000, "IT");

// manager.lead();
// manager.showAll();

// class BankAccount {
//     constructor() {
//         this._balance = 0;
//     }

//     deposit(amount) {
//         this._balance += amount;
//     }

//     showBalance() {
//         console.log(`Saldo saat ini: ${this._balance}`);
//     }
// }

// const akun = new BankAccount();
// akun.deposit(500000);
// akun.showBalance();

// akun._balance = 9999999;
// akun.showBalance();

// class SecureAccount {
//     #balance = 0;
    
//     deposit(amount) {
//         if (amount > 0) {
//             this.#balance += amount;
//             console.log(`Deposited: ${amount}`);
//         } else {
//             console.log("Amount must be positive");
//         }
//     }
    
//     // Added a method to safely update balance if needed
//     setBalance(amount) {
//         if (amount >= 0) {
//             this.#balance = amount;
//             console.log(`Balance set to: ${amount}`);
//         } else {
//             console.log("Balance cannot be negative");
//         }
//     }
    
//     showBalance() {
//         console.log(`Saldo aman: ${this.#balance}`);
//     }
    
//     // Added getter for balance (optional)
//     getBalance() {
//         return this.#balance;
//     }
// }

// // Fixed usage
// const akun = new SecureAccount();
// akun.deposit(500);
// // akun.#balance = 9999; // This line was causing error - private fields cannot be accessed directly
// akun.setBalance(9999); // Use public method instead
// akun.showBalance();

// console.log("---");

// // Message inheritance example (this part was already correct)
// class Message {
//     send() {
//         console.log("Mengirim pesan umum.");
//     }
// }

// class Email extends Message {
//     send() {
//         console.log("Mengirim email ke pengguna.");
//     }
// }

// class SMS extends Message {
//     send() {
//         console.log("Mengirim SMS ke nomor penerima.");
//     }
// }

// const pesan1 = new Message();
// const pesan2 = new Email();
// const pesan3 = new SMS();

// pesan1.send();
// pesan2.send();
// pesan3.send();

class Account {
  #balance = 0;

  constructor(initialBalance = 0) {
    if (typeof initialBalance === 'number' && initialBalance >= 0) {
      this.#balance = initialBalance;
    } else {
      console.error("Initial balance must be a non-negative number.");
    }
  }

  showBalance() {
    console.log(`Saldo Anda adalah: ${this.#balance}`);
  }
}

class PremiumAccount extends Account {
  constructor(initialBalance) {
    super(initialBalance);
  }

  showBalance() {
    console.log(`Saldo Anda adalah: ${this.getBalance()} (Akun Premium)`);
  }
}

class AccountWithGetter {
  #balance = 0;

  constructor(initialBalance = 0) {
    if (typeof initialBalance === 'number' && initialBalance >= 0) {
      this.#balance = initialBalance;
    }
  }

  getBalance() {
    return this.#balance;
  }

  showBalance() {
    console.log(`Saldo Anda adalah: ${this.getBalance()}`);
  }
}

class PremiumAccountWithGetter extends AccountWithGetter {
  constructor(initialBalance) {
    super(initialBalance);
  }

  showBalance() {
    const balance = this.getBalance();
    console.log(`Saldo Anda adalah: ${balance} (Akun Premium)`);
  }
}

console.log("--- Contoh dengan Account ---");
const normalAccount = new AccountWithGetter(500000);
normalAccount.showBalance(); // Output: Saldo Anda adalah: 500000

console.log("\n--- Contoh dengan PremiumAccount ---");
const premiumAccount = new PremiumAccountWithGetter(1000000);
premiumAccount.showBalance(); // Output: Saldo Anda adalah: 1000000 (Akun Premium)