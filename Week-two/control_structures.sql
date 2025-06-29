
DECLARE
    v_marks NUMBER := 75;
BEGIN
    IF v_marks >= 90 THEN
        DBMS_OUTPUT.PUT_LINE('Grade: A');
    ELSIF v_marks >= 75 THEN
        DBMS_OUTPUT.PUT_LINE('Grade: B');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Grade: C');
    END IF;
END;
/

DECLARE
    v_day VARCHAR2(10) := 'MONDAY';
BEGIN
    CASE v_day
        WHEN 'MONDAY' THEN DBMS_OUTPUT.PUT_LINE('Start of the work week');
        WHEN 'FRIDAY' THEN DBMS_OUTPUT.PUT_LINE('End of the work week');
        ELSE DBMS_OUTPUT.PUT_LINE('Midweek day');
    END CASE;
END;
/


BEGIN
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Number: ' || i);
    END LOOP;
END;
/


DECLARE
    i NUMBER := 1;
BEGIN
    WHILE i <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE('While Loop Iteration: ' || i);
        i := i + 1;
    END LOOP;
END;
/

DECLARE
    i NUMBER := 1;
BEGIN
    LOOP
        EXIT WHEN i > 5;
        DBMS_OUTPUT.PUT_LINE('Loop with EXIT: ' || i);
        i := i + 1;
    END LOOP;
END;
/
