package be.howest.ti.sd.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LLTest {

    @Test
    void aNewListIsAlwaysEmpty() {
        LL myList = new LL();
        assertTrue(myList.isEmpty());
    }

    @Test
    void addingAnElementMakesAListNonEmpty() {
        LL myList = new LL();
        myList.add(0, 42);
        assertFalse(myList.isEmpty());
    }

    @Test
    void cannotAddElementsBeforePositionZero() {
        LL myList = new LL();
        assertThrows(LL.OutOfBoundsException.class, ()->myList.add(-1, 42));
    }

    @Test
    void cantRemoveFromEmptyList(){
        LL myList = new LL();
        assertThrows(LL.OutOfBoundsException.class, ()->myList.remove(0));
    }

    @Test
    void removingItemRemovesTheItem(){
        LL myList = new LL();
        myList.add(0, 42);
        myList.add(1,13);
        myList.add(2,12);
        myList.add(3,14);
        myList.remove(1);
        assertEquals(12,myList.get(1));
    }

    @Test
    void cantRemoveBeforePositionZero(){
        LL myList = new LL();
        myList.add(0,42);
        assertThrows(LL.OutOfBoundsException.class, ()->myList.remove(-1));
    }

    @Test
    void canRemoveFromNonEmptyList(){
        LL myList = new LL();
        myList.add(0,42);
        assertDoesNotThrow( ()->myList.remove(0));
    }


    @Test
    void removingAnElementFromASingletonListMakesItEmpty(){
        LL myList = new LL();
        myList.add(0,42);
        myList.remove(0);
        assertTrue(myList.isEmpty());
    }

    @Test
    void removingAnElementFromALongListDoesNotMakeItEmpty(){
        LL myList = new LL();
        myList.add(0,42);
        myList.add(0,21);
        myList.remove(0);
        assertFalse(myList.isEmpty());
    }

    @Test
    void removingLastElementIsOk(){
        LL myList = new LL();
        myList.add(0,42);
        myList.add(0,21);
        assertDoesNotThrow(()->myList.remove(1));
    }



    @Test
    void cantRemoveAfterSize() {
        LL myList = new LL();
        myList.add(0,42);
        myList.add(0,21);
        assertThrows(LL.OutOfBoundsException.class, ()->myList.remove(2));
    }

    @Test
    void cantGetFromEmptyList() {
        LL myList = new LL();
        assertThrows(LL.OutOfBoundsException.class, ()->myList.get(0));
    }

    @Test
    void canGetAtPostZero() {
        LL myList = new LL();
        myList.add(0,42);
        assertDoesNotThrow(()->myList.get(0));
    }

    @Test
    void cantGetBeforePosZero() {
        LL myList = new LL();
        myList.add(0,42);
        assertThrows(LL.OutOfBoundsException.class, ()->myList.get(-1));
    }

    @Test
    void canGetFromSingletonList() {
        LL myList = new LL();
        myList.add(0,42);
        assertEquals(42, myList.get(0));
    }

    @Test
    void lastAddedElementSitsAtPositionZero() {
        LL myList = new LL();
        myList.add(0,42);
        myList.add(0,21);
        assertEquals(21, myList.get(0));
    }

    @Test
    void initialElementSitsAtPosOne() {
        LL myList = new LL();
        myList.add(0,42);
        myList.add(0,21);
        assertEquals(42, myList.get(1));
    }

    @Test
    void initialElementSitsAtPosTwo() {
        LL myList = new LL();
        myList.add(0,84);
        myList.add(0,42);
        myList.add(0,21);
        assertEquals(84, myList.get(2));
    }

    @Test
    void insertElement() {

        LL myList = new LL();
        myList.add(0,4);
        myList.add(0,3);
        //myList.add(0,2);
        myList.add(0,1);
        myList.add(0,0);

        myList.add(2, 2);

        assertEquals(2, myList.get(2));
        assertEquals(3, myList.get(3));
    }





}
