--done in oracle live sql
DECLARE 
    a number; 
    b number; 
PROCEDURE prints(x IN OUT number, y IN number) IS 
BEGIN 
    WHILE x<=y LOOP 
    dbms_output.put_line(x); 
    x:=x+1; 
    END LOOP; 
END; 
BEGIN 
    a:=5; 
    b:=15; 
    prints(a,b); 
END;
/

