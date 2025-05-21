package com.zyw.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class CommandWords {
    private static Map<String, Command> commands;

    @Autowired
    public void setCommands(List<Command> commands0) {
        System.out.println(commands0.size());
        commands = commands0.stream().
                collect(Collectors.toMap(
                        command -> command.getClass().getSimpleName(),
                        command -> command
                ));
        System.out.println(commands.size());
    }

    public void showAll() {
            System.out.println(commands);
    }
}
