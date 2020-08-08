package elsu.nmea.messages;

import elsu.sentence.SentenceBase;

public class VSISignalInformation {

	public static VSISignalInformation fromString(String message) {
		return new VSISignalInformation(message);
	}

	public VSISignalInformation() {
	}

	public VSISignalInformation(String message) {
		parseMessage(message);
	}

	private void parseMessage(String message) {
		String[] params = message.split(",");

		// extract and update last field of checksum
		String[] cValues = params[params.length - 1].split("\\*");
		int checksum = 0;

		// remove * from last field in params
		params[params.length - 1] = params[params.length - 1].replaceAll("\\*.*", "");

		try {
			setChecksum(cValues[1]);
			checksum = Integer.valueOf(cValues[1], 16);

			int calcChecksum = SentenceBase.calculateChecksum(message);
			if (calcChecksum != checksum) {
				setChecksumError(true);
			}
		} catch (Exception exi) {
			setChecksumError(true);
		}

		// parse all the values
		for (int i = 0; i < params.length; i++) {
			switch (i) {
			case 0:
				break;
			case 1:
				setId(params[i]);
				break;
			case 2:
				try {
					setLink(Integer.valueOf(params[i]));
				} catch (Exception exi) {
					setLink(0);
					setExceptions("link value invalid (" + params[i] + ")");
				}
				break;
			case 3:
				try {
					setUtcTime(Float.valueOf(params[i]));
				} catch (Exception exi) {
					setLink(0);
					setExceptions("utc value invalid (" + params[i] + ")");
				}
				break;
			case 4:
				try {
					setSlotnumber(Integer.valueOf(params[i]));
				} catch (Exception exi) {
					setSlotnumber(0);
					setExceptions("slownumber value invalid (" + params[i] + ")");
				}
				break;
			case 5:
				try {
					setSignalstrength(Float.valueOf(params[i]));
				} catch (Exception exi) {
					setSignalstrength(0);
					setExceptions("signalstrength value invalid (" + params[i] + ")");
				}
				break;
			case 6:
				try {
					setSignalnoiseratio(Float.valueOf(params[i]));
				} catch (Exception exi) {
					setSignalnoiseratio(0);
					setExceptions("signalnoiseratio value invalid (" + params[i] + ")");
				}
				break;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();

		buffer.append("{");
		buffer.append("\"id\": \"" + getId() + "\"");
		buffer.append(", \"link\": " + getLink());
		buffer.append(", \"utcTime\": " + getUtcTime());
		buffer.append(", \"slotNumber\": " + getSlotnumber());
		buffer.append(", \"signalStrength\": " + getSignalstrength());
		buffer.append(", \"signalNoiseRatio\": \"" + getSignalnoiseratio() + "\"");
		buffer.append(", \"checksum\": \"" + getChecksum() + "\"");
		buffer.append(", \"checksumError\": " + isChecksumError());
		buffer.append(", \"exceptions\": \"" + getExceptions() + "\"");
		buffer.append("}");

		return buffer.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLink() {
		return link;
	}

	public void setLink(int link) {
		this.link = link;
	}

	public float getUtcTime() {
		return utcTime;
	}

	public void setUtcTime(float utcTime) {
		this.utcTime = utcTime;
	}

	public int getSlotnumber() {
		return slotnumber;
	}

	public void setSlotnumber(int slotnumber) {
		this.slotnumber = slotnumber;
	}

	public float getSignalstrength() {
		return signalstrength;
	}

	public void setSignalstrength(float signalstrength) {
		this.signalstrength = signalstrength;
	}

	public float getSignalnoiseratio() {
		return signalnoiseratio;
	}

	public void setSignalnoiseratio(float signalnoiseratio) {
		this.signalnoiseratio = signalnoiseratio;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public boolean isChecksumError() {
		return checksumError;
	}

	public void setChecksumError(boolean error) {
		this.checksumError = error;
	}

	public String getExceptions() {
		return this.exceptions;
	}

	public void setExceptions(String error) {
		this.exceptions += (this.exceptions.isEmpty() ? "" : ", ") + error;
	}

	private String id = "";
	private int link = 0;
	private float utcTime = 0;
	private int slotnumber = 9999;
	private float signalstrength = 0;
	private float signalnoiseratio = 0;
	private String checksum = "";
	private boolean checksumError = false;
	private String exceptions = "";
}