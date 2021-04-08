import random
import os

def generate_and_save(how_many, lower_bound = 0, upper_bound = 1e6):
    nums = []

    for i in range(how_many):
        nums.append(random.randint(lower_bound, upper_bound))
    
    with open(f"{how_many}_numbers.txt", 'w') as f:
        for index, i in enumerate(nums):
            f.write(str(i))
            if index != how_many - 1:
                f.write('\n')


if __name__ == '__main__':

    random.seed(42)
    os.environ['PYTHONHASHSEED'] = '42'

    generate_and_save(1_000);
    generate_and_save(10_000);
    generate_and_save(100_000);
