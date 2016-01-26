package com.ulfric.xmap;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.google.common.collect.Lists;

public class XMapGen {

	public static void main(String[] args)
	{
		for (int x = 0; x < 30; x++)
		{
			int x1 = x+1;

			File file = new File((x1) + ".yml");

			FileConfiguration conf = YamlConfiguration.loadConfiguration(file);

			conf.set("index", x);
			conf.set("id", 5000 + x);
			conf.set("elements", Lists.newArrayList(String.format("type.image xpos.0 ypos.0 img.p%d.png", x1)));

			try
			{
				conf.save(file);
			}
			catch (IOException exception) { exception.printStackTrace(); }
		}

		System.out.println("DONE");
	}

}