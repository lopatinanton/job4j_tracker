package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StartUITest {
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>(List.of(
                new ExitAction(out)
        )
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                        "Menu:" + ln
                                + "0. Exit Program" + ln
                                + "Wrong input, you can select: 0 .. 0" + ln
                                + "Menu:" + ln
                                + "0. Exit Program" + ln
                                + "=== Exit Program ===" + ln

        );
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        List<UserAction> actions = new ArrayList<>(List.of(
                new EditAction(out),
                new ExitAction(out)
        )
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }

    @Test
        public void whenFindAllItemTestOutputIsSuccessfully() {
            Output out = new StubOutput();
            Tracker tracker = new Tracker();
            Item two = tracker.add(new Item("test2"));
            Input in = new StubInput(
                    new String[] {"0", "1"}
            );
        List<UserAction> actions = new ArrayList<>(List.of(
                    new ShowAllAction(out),
                    new ExitAction(out)
        )
        );
            new StartUI(out).init(in, tracker, actions);
            String ln = System.lineSeparator();
            assertThat(out.toString()).isEqualTo(
                    "Menu:" + ln
                            + "0. Show all Item" + ln
                            + "1. Exit Program" + ln
                            + "=== Show all items ===" + ln
                            + two + ln
                            + "Menu:" + ln
                            + "0. Show all Item" + ln
                            + "1. Exit Program" + ln
                            + "=== Exit Program ===" + ln
            );

    }

    @Test
    public void whenFindByNameItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item three = tracker.add(new Item("test3"));
        Input in = new StubInput(
                new String[] {"0", three.getName(), "1"}
        );
        List<UserAction> actions = new ArrayList<>(List.of(
                new FindByNameAction(out),
                new ExitAction(out)
        )
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Find Item by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ===" + ln
                        + three + ln
                        + "Menu:" + ln
                        + "0. Find Item by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );

    }

    @Test
    public void whenFindByIdItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item four = tracker.add(new Item("test4"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(four.getId()), "1"}
        );
                List<UserAction> actions = new ArrayList<>();
                actions.add(new FindByIdAction(out));
                actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Find Item by Id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find item by id ===" + ln
                        + four + ln
                        + "Menu:" + ln
                        + "0. Find Item by Id" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }
}