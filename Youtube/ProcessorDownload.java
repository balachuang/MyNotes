package bala.tools.spider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.HashMap;

import bala.tools.utils.ConfigsForDownload;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class ProcessorDownload
{
	@Autowired
	ConfigsForDownload config;

	// check cookie file every N sections
	public boolean start() throws MalformedURLException, IOException, URISyntaxException, InterruptedException
	{
		// find cookie file
		File ckFile = new File(config.getCookiePath());
		if (!ckFile.exists()) return false;

		// if cookie file exist, go download
		logger.info("=================== Download Videos ===================");
		logger.info("cookie file found: {}", config.getCookiePath());
		try {
			// prepare yt-dlp update command
			// String ytCmd = String.format("\"%s\" %s", 
			// 	config.getYtDlpPath(),
			// 	config.getYtDlpOptDownload()
			// 		.replace("{{cookiePath}}", config.getCookiePath())
			// 		.replace("{{targetPath}}", config.getTargetPath())
			// );
			// logger.debug("ytCmd: {}", ytCmd);

			// Run yt-dlp.exe
			// Process process = Runtime.getRuntime().exec(ytCmd);

			// 用 Process 執行 yt-dlp 會一直遇到 Process 阻塞的問題. 遇到某些影片就會一直卡住. --> 用這個測試 https://www.youtube.com/watch?v=mE-7pzxLjXo (或是一次用超過 5 個影片.)
			// 改成直接呼叫原來的 BAT 檔來執行, 不要再重新造輪子.
			// ref: https://blog.csdn.net/yuanzihui/article/details/51093375

			Process process = Runtime.getRuntime().exec("cmd /c " + config.getBatchPath());
			process.waitFor();

			// monitor video download folder to decide stop time.
			// Thread.sleep(config.getYtDlpSleep());
			// HashMap<String, Long> videoLengthMap = new HashMap<String, Long>();
			// while (process.isAlive())
			// {
			// 	File videoPath = new File(config.getTargetPath());
			// 	File[] videoFiles = videoPath.listFiles();

			// 	int videoFileCount = 0;
			// 	int otherFileCount = 0;
			// 	long totalLength = 0;
			// 	boolean isFileChange = false;
			// 	for (File file : videoFiles)
			// 	{
			// 		String filename = file.getName().toLowerCase();
			// 		long fileLength = file.length();
			// 		if (filename.endsWith(".mp4")) ++videoFileCount;
			// 		else                           ++otherFileCount;

			// 		if (videoLengthMap.containsKey(filename))
			// 		{
			// 			// video exist, check if length changed
			// 			if ((fileLength != videoLengthMap.get(filename)))
			// 			{
			// 				videoLengthMap.replace(filename, fileLength);
			// 				isFileChange = true;
			// 			}
			// 		}else{
			// 			// new video in folder
			// 			videoLengthMap.put(filename, fileLength);
			// 			isFileChange = true;
			// 		}
			// 		totalLength += fileLength;
			// 	}
			// 	if (!isFileChange && (otherFileCount <= 0) && (totalLength > 0)) break;

			// 	if (totalLength > 0) logger.info("{} videos ({} bytes) downloaded, {} non-video files ongoing.", videoFileCount, totalLength, otherFileCount);
			// 	Thread.sleep(config.getYtDlpSleep());
			// }

			process.destroy();
		}
		catch (Exception ex)
		{
			logger.error("yt-dlp execution Error: {}", ex.getMessage());
		}

		// download done, delete cookie file
		ckFile.delete();
		logger.info("All videos download done. Cookie file deleted.");
		return true;
	}
}
