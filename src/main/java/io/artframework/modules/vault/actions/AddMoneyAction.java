package io.artframework.modules.vault.actions;

import de.raidcraft.economy.wrapper.Economy;
import io.artframework.Action;
import io.artframework.ActionContext;
import io.artframework.ExecutionContext;
import io.artframework.Result;
import io.artframework.Target;
import io.artframework.annotations.ART;
import io.artframework.annotations.ConfigOption;
import lombok.NonNull;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.OfflinePlayer;

@ART(value = "money.add", description = "Adds money to the players bank account.", alias = {"money", "addmoney", "add.money"})
public class AddMoneyAction implements Action<OfflinePlayer> {

    @ConfigOption(required = true, position = 0, description = "The amount of money that is added to the player.")
    private double amount;
    @ConfigOption(position = 1, description = "The details of the transaction that are recorded in the transaction log.")
    private String details;

    @Override
    public Result execute(@NonNull Target<OfflinePlayer> target, @NonNull ExecutionContext<ActionContext<OfflinePlayer>> context) {

        EconomyResponse response = Economy.get().depositPlayer(target.source(), amount, details);
        return resultOf(response.transactionSuccess(), response.errorMessage);
    }
}
