'''
Created on Sep 13, 2025

@author: Jason Powell
'''

import random
import csv

def generate_transactions(num_transactions: int):
    transactions = []
    for _ in range(num_transactions):
        account_number = random.randint(10000, 99999)   # 5-digit account number
        amount = round(random.uniform(-1000.0, 1000.0), 2)  # random float
        transactions.append((account_number, amount))
    return transactions

def save_transactions_to_csv(transactions, filename="transactions.csv"):
    with open(filename, mode="w", newline="") as file:
        writer = csv.writer(file)
        writer.writerow(["account_number", "amount"])  # header row
        writer.writerows(transactions)

if __name__ == "__main__":
    random.seed()  # optional: set a fixed seed for reproducibility
    transactions = generate_transactions(20)  # generate 20 transactions
    save_transactions_to_csv(transactions, "../files/transactions.csv")
    print(f"Saved {len(transactions)} transactions to 'transactions.csv'")