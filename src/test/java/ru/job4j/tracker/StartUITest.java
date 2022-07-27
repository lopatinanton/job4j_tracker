package ru.job4j.tracker;


import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new EditAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        ));
    }

    @Test
        public void whenFindAllItemTestOutputIsSuccessfully() {
            Output out = new StubOutput();
            Tracker tracker = new Tracker();
            Item two = tracker.add(new Item("test2"));
            Input in = new StubInput(
                    new String[] {"0", String.valueOf(two.getId()), "1"}
            );
            UserAction[] actions = new UserAction[]{
                    new ShowAllAction(out),
                    new ExitAction(out)
            };
            new StartUI(out).init(in, tracker, actions);
            String ln = System.lineSeparator();
            assertThat(out.toString(), is(
                    "Menu:" + ln
                            + "0. Show all Item" + ln
                            + "1. Exit Program" + ln
                            + "=== Show all items ===" + ln
                            + two + ln
                            + "Menu:" + ln
                            + "0. Show all Item" + ln
                            + "1. Exit Program" + ln
                            + "=== Exit Program ===" + ln
            ));

    }

    @Test
    public void whenFindByNameItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item three = tracker.add(new Item("test3"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(three.getName()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Find Item by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ===" + ln
                        + three + ln
                        + "Menu:" + ln
                        + "0. Find Item by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        ));

    }

    @Test
    public void whenFindByIdItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item four = tracker.add(new Item("test4"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(four.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Find Item by Id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find item by id ===" + ln
                        + four + ln
                        + "Menu:" + ln
                        + "0. Find Item by Id" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        ));

    }
}