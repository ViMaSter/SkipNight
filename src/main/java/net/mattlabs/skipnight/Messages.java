package net.mattlabs.skipnight;

import static net.md_5.bungee.api.ChatColor.*;

import co.aikar.commands.BaseCommand;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;

class Messages {

    private Messages() {

    }

    static BaseComponent[] noVoteInProg() {
        // No vote in progress! [Start Vote] (runs /skipnight)
        return new ComponentBuilder("No vote in progress! ")
                    .color(RED)
                .append("[Start Vote]")
                    .color(BLUE)
                    .bold(true)
                    .event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/skipnight"))
                    .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                            new ComponentBuilder("Click here to start a vote")
                                        .color(GOLD)
                                        .bold(true)
                                    .create()))
                .create();
    }

    static BaseComponent[] voteStarted() {
        //&7[&9Vote&7] &rA vote to skip the night has started!
        return new ComponentBuilder("[")
                    .color(GRAY)
                .append("Vote")
                    .color(BLUE)
                .append("] ")
                    .color(GRAY)
                .append("A vote to skip the night has started!")
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] voteButtons() {
        //&9 - &rPlease vote: || &a&l[Yes]||cmd:/skipnight yes||ttp:&6&lClick &rhere to vote yes.|| &4&l[No]||cmd:/skipnight no||ttp:&6&lClick &rhere to vote no.
        return new ComponentBuilder(" - ")
                    .color(BLUE)
                .append("Please vote: ")
                    .color(WHITE)
                .append("[Yes]")
                    .color(GREEN)
                    .bold(true)
                    .event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/skipnight yes"))
                    .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                            new ComponentBuilder("Click here to vote yes")
                                        .color(GOLD)
                                        .bold(true)
                                    .create()))
                .append(" ")
                .append("[No]")
                    .color(DARK_RED)
                    .bold(true)
                    .event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/skipnight no"))
                    .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                            new ComponentBuilder("Click here to vote no")
                                        .color(GOLD)
                                        .bold(true)
                                    .create()))
                .create();
    }

    static BaseComponent[] youVoteYes() {
        // &9 - &rYou voted &5&lyes&r.
        return new ComponentBuilder(" - ")
                    .color(BLUE)
                .append("You voted ")
                    .color(WHITE)
                .append("yes")
                    .color(BLUE)
                    .bold(true)
                .append(".")
                    .reset()
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] youVoteNo() {
        // &9 - &rYou voted &5&lno&r.
        return new ComponentBuilder(" - ")
                    .color(BLUE)
                .append("You voted ")
                    .color(WHITE)
                .append("no")
                    .color(BLUE)
                    .bold(true)
                .append(".")
                    .reset()
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] tenSecondsLeft() {
        // &7[&9Vote&7] &5&l10 &rseconds left to vote!
        return new ComponentBuilder("[")
                    .color(GRAY)
                .append("Vote")
                    .color(BLUE)
                .append("]")
                    .color(GRAY)
                .append(" 10")
                    .color(BLUE)
                    .bold(true)
                .append(" seconds left to vote!")
                    .reset()
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] votePassed() {
        // &7[&9Vote&7] &rVote &5&lpassed&r! Skipping the night.
        return new ComponentBuilder("[")
                    .color(GRAY)
                .append("Vote")
                    .color(BLUE)
                .append("] ")
                    .color(GRAY)
                .append("Vote ")
                    .color(WHITE)
                .append("passed")
                    .color(BLUE)
                    .bold(true)
                .append("! Skipping the night.")
                    .reset()
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] voteFailed() {
        // &7[&9Vote&7] &rVote &5&lfailed&r! The night will not be skipped.
        return new ComponentBuilder("[")
                    .color(GRAY)
                .append("Vote")
                    .color(BLUE)
                .append("] ")
                    .color(GRAY)
                .append("Vote ")
                    .color(WHITE)
                .append("failed")
                    .color(BLUE)
                    .bold(true)
                .append("! The night will not be skipped.")
                    .reset()
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] alreadyVoted() {
        // &9 - &r&cYou have already voted!
        return new ComponentBuilder(" - ")
                    .color(BLUE)
                .append("You have already voted!")
                    .color(RED)
                .create();
    }

    static BaseComponent[] mustSleep() {
        // &9 - &r&cYou must sleep in a bed first!
        return new ComponentBuilder(" - ")
                    .color(BLUE)
                .append("You must sleep in a bed first!")
                    .color(RED)
                .create();
    }

    static BaseComponent[] idle() {
        //  &9 - &rYou are &3&lidle&r, your vote will not count.
        return new ComponentBuilder(" - ")
                    .color(BLUE)
                .append("You are ")
                    .color(WHITE)
                .append("idle")
                    .color(DARK_AQUA)
                    .bold(true)
                .append(", your vote will not count.")
                    .reset()
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] away() {
        //  &9 - &rYou are &1&laway&r, your vote will not count.
        return new ComponentBuilder(" - ")
                    .color(BLUE)
                .append("You are ")
                    .color(WHITE)
                .append("away")
                    .color(BLUE)
                    .bold(true)
                .append(", your vote will not count.")
                    .reset()
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] back() {
        // &9 - &rWelcome back.
        return new ComponentBuilder(" - ")
                    .color(BLUE)
                .append("Welcome back.")
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] leftWorld() {
        // &7[&9Vote&7] &rYou left the world, your vote will not count.
        return new ComponentBuilder("[")
                    .color(GRAY)
                .append("Vote")
                    .color(BLUE)
                .append("]")
                    .color(GRAY)
                .append(" You left the world, your vote will not count.")
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] inBedVotedYes() {
        // &9 - &rYou are now in bed, automatically voting yes.
        return new ComponentBuilder(" - ")
                    .color(BLUE)
                .append("You are now in bed, automatically voting yes.")
                    .color(WHITE)
                .create();
    }

    static BaseComponent[] inBedNoVoteInProg() {
        //&7[&9Vote&7] &rStart a vote to skip the night? || &5&l[Vote]||cmd:/skipnight||ttp:&6&lClick &rhere to start a vote.
        return new ComponentBuilder("[")
                    .color(GRAY)
                .append("Vote")
                    .color(BLUE)
                .append("]")
                    .color(GRAY)
                .append(" Start a vote to skip the night?")
                    .color(WHITE)
                .append("[Start Vote]")
                    .color(BLUE)
                    .bold(true)
                    .event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/skipnight"))
                    .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                            new ComponentBuilder("Click here to start a vote")
                                    .color(GOLD)
                                    .bold(true)
                                    .create()))
                .create();
    }
}

