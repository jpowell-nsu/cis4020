'''
Created on Sep 13, 2025

@author: Jason Powell
'''
import random
import csv

def generate_processes(num_processes: int):
    processes = []
    for _ in range(num_processes):
        process_id = random.randint(1000, 99999)  # arbitrary PID range
        address_int = random.randint(0, 2**64 - 1)  # 64-bit address space
        address_hex = f"0x{address_int:016x}"  # zero-padded 64-bit hex
        processes.append((process_id, address_hex))
    return processes

def save_processes_to_csv(processes, filename="processes.csv"):
    with open(filename, mode="w", newline="") as file:
        writer = csv.writer(file)
        writer.writerow(["process_id", "address"])  # header
        writer.writerows(processes)

if __name__ == "__main__":
    random.seed()  # optional: set seed for reproducibility
    processes = generate_processes(20)  # generate 20 processes
    save_processes_to_csv(processes, "../files/processes.csv")
    print(f"Saved {len(processes)} processes to 'processes.csv'")