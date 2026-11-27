RESOLVED CONCERS
1. Naming conventions are specified (i.e. n to name), as well as methods are renamed
2. Logical errors are applied, such that invalid entries are rejected
3. Duplicated code are changed to prevent duplicates of registrations regardless of lower or upper casing, used the equalsIgnoreCase()
4. Security of student list is ensured because it is now private
   
NEEDS IMPROVEMENT
1. the code formatting is better but the addStudent() method still handles both the storing and printing of messages
2. Input validation, specifically the grades, whereas Float.NaN should be Float.isFinite to allow only grades between 0-100 is accepted

NOT RESOLVED
1. There is not complete details of registered students (i.e. grades, age) when printed
