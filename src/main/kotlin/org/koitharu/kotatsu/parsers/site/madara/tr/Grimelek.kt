package org.koitharu.kotatsu.parsers.site.madara.tr

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.initmanga.InitMangaParser

@MangaSourceParser("GRIMELEK", "Grimelek", "tr")
internal class Grimelek(context: MangaLoaderContext) :
	InitMangaParser(
		context = context,
		source = MangaParserSource.GRIMELEK,
		domain = "siyahmelek.mom",
		pageSize = 20,
		searchPageSize = 20,
		mangaUrlDirectory = "manga",
		popularUrlSlug = "top-follow",
		isCloudflareProtected = true,
	)
