package be.howest.ti.sd.tdd;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ALTest {

    @Test
    void aNewListIstAlwaysEmpty(){
        AL myList = new AL();

        assertTrue(myList.isEmpty());
    }

    @Test
    void addingAnItemIsNotEmpty(){
        AL myList = new AL();
        myList.add(0,42);
        assertFalse(myList.isEmpty());
    }

    @Test
    void removingItemInSingletonListIsEmpty(){
        AL myList = new AL();
        myList.add(0, 42);
        myList.remove(0);
        assertTrue(myList.isEmpty());
    }

    @Test
    void removingItemInLongListIsNotEmpty(){
        AL myList = new AL();
        myList.add(0, 42);
        myList.add(1, 42);
        myList.remove(1);
        assertFalse(myList.isEmpty());
    }

    @Test
    void removingItemRemovesTheItem(){
        AL myList = new AL();
        myList.add(0, 42);
        myList.add(1, 13);
        myList.add(2,12);
        myList.remove(1);
        assertEquals(12,myList.get(1));
    }

    @Test
    void addingOutOfBoundsNotPossible(){
        AL myList = new AL();
        assertThrows(IndexOutOfBoundsException.class, () -> myList.add(-1, 42));
        myList.add(0, 42);
        assertThrows(IndexOutOfBoundsException.class, () -> myList.add(2, 42));
    }

    @Test
    void cantRemoveFromEmptyList(){
        AL myList = new AL();
        assertThrows(IndexOutOfBoundsException.class, () -> myList.remove(0));
    }

    @Test
    void removingOutOfBoundsNotPossible(){
        AL myList = new AL();
        myList.add(0, 42);
        assertThrows(IndexOutOfBoundsException.class, () -> myList.remove(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> myList.remove(1));
    }

    @Test
    void cantGetFromEmptyList(){
        AL myList = new AL();
        assertThrows(IndexOutOfBoundsException.class, () -> myList.get(0));
    }

    @Test
    void canGetFromNonEmptyList(){
        AL myList = new AL();
        myList.add(0, 42);
        assertDoesNotThrow(() -> {myList.get(0);});
    }

    @Test
    void canGetValueFromPosZero(){
        AL myList = new AL();
        myList.add(0, 42);
        assertEquals(42, myList.get(0));
    }

    @Test
    void cantGetFromOutOfBounds(){
        AL myList = new AL();
        myList.add(0, 42);
        assertThrows(IndexOutOfBoundsException.class, () -> myList.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> myList.get(1));

    }

    @Test
    void lastAddedSitsAtPosZero(){
        AL myList = new AL();
        myList.add(0, 42);
        myList.add(0, 21);
        assertEquals(21,myList.get(0));
    }

    @Test
    void initialItemSitsAtPosOne(){
        AL myList = new AL();
        myList.add(0, 42);
        myList.add(0, 21);
        assertEquals(42,myList.get(1));
    }

    @Test
    void initialItemSitsAtPosTwo(){
        AL myList = new AL();
        myList.add(0, 42);
        myList.add(0, 21);
        myList.add(0, 81);
        assertEquals(42,myList.get(2));
    }

    @Test
    void InsertElement(){
        AL myList = new AL();
        myList.add(0, 4);
        myList.add(0, 3);
        myList.add(0, 1);
        myList.add(0, 0);
        myList.add(2, 2);
        assertEquals(2, myList.get(2));
    }

    @Test
    void canAddMoreThanTenElements(){
        AL myList = new AL();
        myList.add(0, 42);
        myList.add(0, 21);
        myList.add(0, 81);
        myList.add(0, 42);
        myList.add(0, 21);
        myList.add(0, 81);
        myList.add(0, 42);
        myList.add(0, 21);
        myList.add(0, 81);
        myList.add(0, 42);
        assertDoesNotThrow(() -> myList.add(0, 42));
    }
}
