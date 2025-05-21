package com.zyw.command;

import org.springframework.stereotype.Component;

@Component
public class GoCommand implements Command
{
    @Override
    public boolean execute(String command)
    {
        return true;
    }

}
