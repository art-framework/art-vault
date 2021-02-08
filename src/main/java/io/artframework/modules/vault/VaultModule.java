package io.artframework.modules.vault;

import io.artframework.Scope;
import io.artframework.annotations.ArtModule;
import io.artframework.annotations.OnDisable;
import io.artframework.annotations.OnEnable;
import io.artframework.annotations.OnLoad;
import io.artframework.annotations.OnReload;

@ArtModule(
    value = "art-vault",
    description = "Adds actions, requirements and trigger for the Vault plugin.",
    version = "@VERSION@",
    prefix = "vault",
    depends = {
         "plugin:Vault"
    }
)
public class VaultModule {

    @OnLoad
    public void onLoad(Scope scope) {

    }
    
    @OnReload
    public void onReload(Scope scope) {

    }

    @OnEnable
    public void onEnable(Scope scope) {

    }

    @OnDisable
    public void onDisable(Scope scope) {

    }
}
