require './app/mission_c_090.rb'

describe '黒電話移動距離のチェック' do
  describe '出力結果のテスト' do
    let(:missionC090) { MissionC090.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "9315-35-7398\n" }
      expect($stdout).to receive(:puts).with(146)
      missionC090.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "043-2303-3412\n" }
      expect($stdout).to receive(:puts).with(134)
      missionC090.run
    end
  end
end
