CREATE TABLE students (
    student_id NUMBER PRIMARY KEY,
    name VARCHAR2(50),
    marks NUMBER
);

INSERT INTO students VALUES (1, 'Rahul', 85);
INSERT INTO students VALUES (2, 'Priya', 92);
INSERT INTO students VALUES (3, 'Anil', 74);
COMMIT;

CREATE OR REPLACE PROCEDURE insert_student(
    p_id IN NUMBER,
    p_name IN VARCHAR2,
    p_marks IN NUMBER
) AS
BEGIN
    INSERT INTO students(student_id, name, marks)
    VALUES (p_id, p_name, p_marks);
    DBMS_OUTPUT.PUT_LINE('Student inserted successfully.');
END;
/

CREATE OR REPLACE PROCEDURE get_student_details(
    p_id IN NUMBER
) AS
    v_name students.name%TYPE;
    v_marks students.marks%TYPE;
BEGIN
    SELECT name, marks INTO v_name, v_marks
    FROM students
    WHERE student_id = p_id;
    
    DBMS_OUTPUT.PUT_LINE('Name: ' || v_name);
    DBMS_OUTPUT.PUT_LINE('Marks: ' || v_marks);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No student found with ID: ' || p_id);
END;
/

BEGIN
    insert_student(4, 'Sneha', 88);
    get_student_details(4);
END;
/
