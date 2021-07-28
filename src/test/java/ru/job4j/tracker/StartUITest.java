package ru.job4j.tracker;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class StartUITest {

    @Test
    public void WhenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new Exit());

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
                new String[] {"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();

        actions.add(new FindItemById(out));
        actions.add(new Exit());

        Item item = tracker.add(new Item("testForTest"));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.=== find item by id ===" + System.lineSeparator() +
                        "1.=== Exit ===" + System.lineSeparator() +
                          "result: " + item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== find item by id ===" + System.lineSeparator() +
                        "1.=== Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void WhenFindByNameAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "testName", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();

        actions.add(new FindItemsByName(out));
        actions.add(new Exit());

        Item item = tracker.add(new Item("testName"));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.=== find items by name ===" + System.lineSeparator() +
                        "1.=== Exit ===" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== find items by name ===" + System.lineSeparator() +
                        "1.=== Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void WhenFindAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1"));
        Item item2 = tracker.add(new Item("test2"));
        List<UserAction> actions = new ArrayList<>();

        actions.add(new ShowAllItems(out));
        actions.add(new Exit());

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.=== Show all items ===" + System.lineSeparator() +
                        "1.=== Exit ===" + System.lineSeparator() +
                        item1 + System.lineSeparator() +
                        item2 + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.=== Show all items ===" + System.lineSeparator() +
                        "1.=== Exit ===" + System.lineSeparator()
        ));
    }

    @Test public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput (
                new String[] {"-1", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();

        actions.add(new Exit());

        new StartUI(out).init(in, tracker,actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0.=== Exit ===" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0.=== Exit ===" + ln
                )
        );
    }
}