require './app/mission_c_087.rb'

describe '回文数のチェック' do
  describe '出力結果のテスト' do
    let(:missionC087) { MissionC087.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "261\n" }
      expect($stdout).to receive(:puts).with(747)
      missionC087.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "1000\n" }
      expect($stdout).to receive(:puts).with(1001)
      missionC087.run
    end
  end
end
