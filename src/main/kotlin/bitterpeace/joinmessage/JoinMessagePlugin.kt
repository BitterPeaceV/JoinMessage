package bitterpeace.joinmessage

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerJoinEvent
import cn.nukkit.plugin.PluginBase

class JoinMessagePlugin : PluginBase(), Listener {
    override fun onEnable() {
        logger.info("Enabled JoinMessage Plugin!")
        server.pluginManager.registerEvents(this, this)
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        event.player.sendMessage("Hello World!")
    }
}