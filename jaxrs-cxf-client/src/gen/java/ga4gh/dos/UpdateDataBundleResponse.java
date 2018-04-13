package ga4gh.dos;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateDataBundleResponse  {
  
  @ApiModelProperty(value = "REQUIRED The identifier of the Data Bundle updated.")
 /**
   * REQUIRED The identifier of the Data Bundle updated.  
  **/
  private String dataBundleId = null;
 /**
   * REQUIRED The identifier of the Data Bundle updated.
   * @return dataBundleId
  **/
  @JsonProperty("data_bundle_id")
  public String getDataBundleId() {
    return dataBundleId;
  }

  public void setDataBundleId(String dataBundleId) {
    this.dataBundleId = dataBundleId;
  }

  public UpdateDataBundleResponse dataBundleId(String dataBundleId) {
    this.dataBundleId = dataBundleId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDataBundleResponse {\n");
    
    sb.append("    dataBundleId: ").append(toIndentedString(dataBundleId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

