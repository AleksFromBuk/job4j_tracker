//package ru.job4j.tracker;
//
//import org.hamcrest.Matchers;
//import org.junit.Test;
//import static org.hamcrest.core.Is.is;
//import static org.hamcrest.core.IsNull.nullValue;
//import static org.junit.Assert.*;
//
//public class StartUITest {
//    @Test
//    public void whenAddItem() {
//        String[] answers = {"Fix PC"};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//        StartUI.createItem(input, tracker);
//        Item created = tracker.findAll()[0];
//        Item expected = new Item("Fix PC");
//        assertThat(created.getName(), is(expected.getName()));
//    }
//
//    @Test
//    public void editItem() {
//
//            Tracker tracker = new Tracker();
//            Item item = new Item("new item");
//            tracker.add(item);
//            String[] answers = {
//                    String.valueOf(item.getId()), /* id сохраненной заявки в объект tracker. */
//                    "replaced item"
//            };
//            StartUI.editItem(new StubInput(answers), tracker);
//            Item replaced = tracker.findById(item.getId());
//            assertThat(replaced.getName(), is("replaced item"));
//    }
//
//    @Test
//    public void deleteItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item("only current element");
//        tracker.add(item);
//        String answer[] = {String.valueOf(item.getId())};
//        StartUI.deleteItem(new StubInput(answer), tracker);
//        assertNull(tracker.findById(item.getId()));
//    }
//}