javascript:(function() {
	let allUrls = '';
	let allShorts = document.querySelectorAll('a.shortsLockupViewModelHostEndpoint');
	for (var i in allShorts)
	{
		let thisUrl = allShorts[i].href;
		if (thisUrl == undefined) continue;
		if (thisUrl.indexOf('/shorts/') < 0) continue;
		if (allUrls.indexOf(thisUrl) >= 0) continue;
		allUrls += thisUrl + '\n';
	}
	navigator.clipboard.writeText(allUrls);
	alert('All short urls copied.');
})()