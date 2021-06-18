package ru.job4j.tracker;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;


public class StartUITest {

    @Test
    public void WhenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.=== Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void WhenFindByIdAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "testForTest", "1", "1", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out), new FindItemById(out), new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== find item by id ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator() +
                        "=== Create a new Item ===" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== find item by id ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator() +
                          "result: " + "Item{id=1, name='testForTest'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== find item by id ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void WhenFindByNameAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "testName", "1", "testName", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out), new FindItemsByName(out), new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== find items by name ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator() +
                        "=== Create a new Item ===" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== find items by name ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator() +
                        "Item{id=1, name='testName'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== find items by name ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void WhenFindAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "test1", "0", "test2", "1", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out), new ShowAllItems(out), new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== Show all items ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator() +
                        "=== Create a new Item ===" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== Show all items ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator() +
                        "=== Create a new Item ===" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== Show all items ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator() +
                        "Item{id=1, name='test1'}" + System.lineSeparator() +
                        "Item{id=2, name='test2'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== Add new Item ===" + System.lineSeparator() +
                        "1.=== Show all items ===" + System.lineSeparator() +
                        "2.=== Exit ===" + System.lineSeparator()
        ));
    }
}